package com.kdls.entity;

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class Test {
        /**
         * @param args
         */
        public static void main(String[] args) {
            Test f = new Test();
            List<File> ll = f.getFiles(new File("D:\\222"),"txt");
            for (File ff : ll) {
                System.out.println(ff.getPath());
            }
        }
        public List<File> getFiles(File fileDir, String fileType) {
            List<File> lfile = new ArrayList<File>();
            File[] fs = fileDir.listFiles();
            for (File f : fs) {
                if (f.isFile()) {
                    if (fileType
                            .equals(f.getName().substring(
                                    f.getName().lastIndexOf(".") + 1,
                                    f.getName().length())))
                        lfile.add(f);
                } else {
                    List<File> ftemps = getFiles(f,fileType);
                    lfile.addAll(ftemps);
                }
            }
            return lfile;
        }
    }

