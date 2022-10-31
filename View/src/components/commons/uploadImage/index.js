// import React from 'react';
// import { useState } from 'react';


// const UploadAndDisplayImage = () => {
//     const base64code=''
//   const [selectedImage, setSelectedImage] = useState(null);
//   const onLoad = fileString => {
//     console.log(fileString);
//     base64code = fileString
//   };

//   const getBase64 = file => {
//     let reader = new FileReader();
//     reader.readAsDataURL(file);
//     reader.onload = () => {
//       onLoad(reader.result);
//     };
//   };
//   getBase64(selectedImage);
//   console.log()
//   return (
//     <div>
//       <h1>Upload and Display Image usign React Hook's</h1>
//       {selectedImage && (
//         <div>
//         <img alt="not fount" width={"250px"} src={URL.createObjectURL(selectedImage)} />
//         <br />
//         <button onClick={()=>setSelectedImage(null)}>Remove</button>
//         </div>
//       )}
//       <br />
     
//       <br /> 
//       <input
//         type="file"
//         name="myImage"
//         onChange={(event) => {
//           console.log(event.target.files[0]);
//           setSelectedImage(event.target.files[0]);
//         }}
//       />
//     </div>
//   );
// };

// export default UploadAndDisplayImage;
