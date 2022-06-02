package org.wecancoeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/reviews")
    public String findAllReviews(Model model){
        model.addAttribute("reviewModel", reviewRepo.findAll());
        return "reviewTemplate";
    }

}
