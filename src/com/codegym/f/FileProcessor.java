package com.codegym.f;

import java.io.*;

public class FileProcessor {
    void writeFile(InputStream is, OutputStream os) throws IOException {
        byte buffer[] = new byte[8192];
        int bytesRead;
        while ((bytesRead = is.read(buffer)) != -1) {
            os.write(buffer, 0, bytesRead);
        }
        os.flush();
        os.close();
    }

    void writeFromString(String s, OutputStream os) {
        try{
            FileOutputStream fout=new FileOutputStream("testout.txt");
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    void readFromStream() {
        try{
            FileInputStream fin=new FileInputStream("testout.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
