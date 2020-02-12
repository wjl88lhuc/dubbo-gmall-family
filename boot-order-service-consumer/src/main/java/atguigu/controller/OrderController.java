package atguigu.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     *  初始化订单
     * @return
     */
    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("userId") String userId){
        return  orderService.initOrder(userId);
    }
}
