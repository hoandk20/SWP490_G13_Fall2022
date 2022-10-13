import axios from "axios";
import jwtDecode from "jwt-decode";
import { loginSuccess } from "./redux/authSlice";

const refreshTocken = () =>{
    try {
        const res =axios.post("",{
            withCredentials:true
        });
        return res.data;

    } catch (error) {
        console.log(error)
    }
};

export const createAxios = (user,dispatch,stateSuccess) =>{
    const newInstance=axios.create();

    newInstance.interceptors.request.use(
        async(config) => {
            let date = new Date();
            const decodedTocken=jwtDecode(user?.accessTocken);
            if(decodedTocken.exp <date.getTime()/1000){
                const data=await refreshTocken();
                const refreshUser={
                    ...user,
                    accessTocken:data.accessTocken
                };
                dispatch(stateSuccess(refreshTocken()));
                config.headers["tocken"]="Bearer" + data.accessTocken;

            }
            return config;
        },
        (err) => {
            return Promise.reject(err);
        }
    );
    return newInstance;
}