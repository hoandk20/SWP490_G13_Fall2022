package com.G13.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.util.Base64;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class FileService {
    public String convertBase64ToImage(String base64, String NameFile){

        String[] strings = base64.split(",");
        String extension;
        switch (strings[0]) {//check image's extension
            case "data:image/jpeg;base64":
                extension = "jpeg";
                break;
            case "data:image/gif;base64":
                extension = "gif";
                break;
            case "data:image/pdf;base64":
                extension = "pdf";
                break;
            case "data:image/png;base64":
                extension = "png";
                break;
            default://should write cases for more images types
                extension = "jpg";
                break;
        }
        //convert base64 string to binary data
        byte[] data = DatatypeConverter.parseBase64Binary(strings[1]);
        String path = "D:\\G13\\doc\\"+NameFile+"." + extension;
        File file = new File(path);
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            outputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
    public String GetBase64FromPath(String filePath){
        String base64File = "";
        File file = new File(filePath);
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            // Reading a file from file system
            byte fileData[] = new byte[(int) file.length()];
            imageInFile.read(fileData);
            base64File = Base64.getEncoder().encodeToString(fileData);

            if(!base64File.equals("") && !filePath.equals("")){
                //   String []strings = filePath.split(".");
                String extension = getExtension(filePath);
                switch (extension) {//check image's extension
                    case "jpeg":
                        base64File = "data:image/jpeg;base64,"+base64File;
                        break;
                    case "gif":
                        base64File = "data:image/gif;base64,"+base64File;;
                        break;
                    case "pdf":
                        base64File = "data:image/pdf;base64,"+base64File;;
                        break;
                    case "png":
                        base64File = "data:image/png;base64,"+base64File;;
                        break;
                    default://should write cases for more images types
                        base64File = "data:image/jpg;base64,"+base64File;;
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the file " + ioe);
        }
        return base64File;
    }
    public static String getExtension(String fileName) {
        char ch;
        int len;
        if(fileName==null ||
                (len = fileName.length())==0 ||
                (ch = fileName.charAt(len-1))=='/' || ch=='\\' || //in the case of a directory
                ch=='.' ) //in the case of . or ..
            return "";
        int dotInd = fileName.lastIndexOf('.'),
                sepInd = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));
        if( dotInd<=sepInd )
            return "";
        else
            return fileName.substring(dotInd+1).toLowerCase();
    }
}
