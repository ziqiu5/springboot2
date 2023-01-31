package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.User;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;
import java.io.File;
import java.io.IOException;

/**
 * ClassName: FormController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/29 - 20:01  20:01
 * @Version: v1.0
 */

@Controller
@Slf4j
public class FormController {

    @RequestMapping("/formLayOuts")
    public String formLayOuts(){
        int i = 1 / 0;
        return "form/form_layouts";
    }

    @RequestMapping("/upload")
    public String upload(@RequestParam String username, @RequestParam String email,
                         @RequestPart MultipartFile headerImg,
                         @RequestPart MultipartFile[] photos) throws IOException {
        log.info("username{}",username );
        log.info("email{}",email );
        log.info("MultipartFile{}",headerImg.getSize() );
        log.info("MultipartFile[]{}",photos.length );

        if(!headerImg.isEmpty()){
            headerImg.transferTo(new File("D:\\MyTrain\\" + headerImg.getOriginalFilename()));
        }
        if(photos.length > 0){
            for (MultipartFile photo : photos) {
                photo.transferTo(new File("D:\\MyTrain\\" + photo.getOriginalFilename()));
            }
        }

        return "index";
    }

}
