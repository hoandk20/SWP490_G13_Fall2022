import React from "react";
import { useSelector } from "react-redux";
import jwtDecode from "jwt-decode";
import Forbidden from "../../../views/forbiden";


function PrivateRoute({ roleTarget, children }) {

  const currentUser = useSelector((state)=>state.auth.login?.currentUser);
    
  // console.log(currentUser?.access_token);
  if(roleTarget === "ALL"){
    return children;
  }else{
    if(currentUser!==null){
        const decodedTocken=jwtDecode(currentUser.access_token);
        const role=decodedTocken.roles[0];
        console.log(decodedTocken.roles[0]);
        if(role.includes(roleTarget)){
            return children;
        }else{
            return <Forbidden/>
        }
      }else{
        return <Forbidden/>
      }
  }


}

export default PrivateRoute;