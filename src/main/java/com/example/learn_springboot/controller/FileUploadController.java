package com.example.learn_springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {

    @PostMapping("/upload")
    public String up(@RequestParam("nickname") String nickname, @RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        System.out.println(nickname);
        // 文件的原始名字
        System.out.println(file.getOriginalFilename());
        // 文件类型
        System.out.println(file.getContentType());

        // 获取web服务器的运行目录
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        saveFile(file, path);
        return "上传成功";
    }

    public void saveFile(MultipartFile file, String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }

        File _file = new File(path + file.getOriginalFilename());
        file.transferTo(_file);
    }
}
