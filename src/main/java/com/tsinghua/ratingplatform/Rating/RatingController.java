package com.tsinghua.ratingplatform.Rating;

import com.tsinghua.ratingplatform.service.*;
import com.tsinghua.ratingplatform.Entity.*;
import com.alibaba.fastjson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;

@RestController
public class RatingController {

    @Autowired
    private UserService userService;

    @Autowired
    private ScoreService scoreService;

    @RequestMapping(value = "/showImage", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] showImage() throws IOException {
        File file = new File("/Users/liyuankun/Documents/internship/age_elders/0.png");
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        Map<String, byte[]> res = new HashMap<String, byte[]>();
        res.put("0", bytes);
        return bytes;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public JSONObject login(@RequestParam Integer uid)  {
        User user = userService.findUser(uid);
        JSONObject res = new JSONObject();
        if ( user == null) {
            res.put("result",0);
            return res;
        } else {
            JSONObject detail = new JSONObject();
            int userId = user.getUserId();
            if (userId/100 > 1) {
                detail.put("userid",user.getUserId());
            }
            detail.put("gender",user.getGender());
            detail.put("age",user.getAge());
            detail.put("finished",user.getFinished());
            res.put("result",1);
            res.put("detail",detail);
            return res;
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public int login(@RequestParam Integer uid, @RequestParam Integer gender, @RequestParam Integer age, @RequestParam Integer finished)  {
        User user = new User();
        user.setUserId(uid);
        user.setGender(gender);
        user.setAge(age);
        user.setFinished(finished);
        userService.addUser(user);
        return 1;
    }

    @RequestMapping(value = "/updatePreference", method = RequestMethod.GET)
    public int updatePreference(@RequestParam Integer uid, @RequestParam Integer pid, @RequestParam Integer score)  {
        Score rate = new Score();
        rate.setUserId(uid);
        rate.setPhotoId(pid);
        rate.setScore(score);
        scoreService.addRate(rate);
        return 1;
    }

    @RequestMapping(value = "/updateRateTimes", method = RequestMethod.GET)
    public int updateRateTimes(@RequestParam Integer uid)  {
        User user = userService.findUser(uid);
        int finished = user.getFinished();
        user.setFinished(finished + 1);
        userService.modifyUser(user);
        return finished + 1;
    }
}
