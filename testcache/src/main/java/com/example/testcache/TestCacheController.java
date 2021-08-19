package com.example.testcache;

import com.example.testcache.model.DistrictDO;
import com.example.testcache.model.DistrictRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("app")
public class TestCacheController {
    @Resource
    DistrictRepository districtRepository;

    //浏览器里执行 https://localpc.qingchiapp.com:8097/app/hello?adCode=100000
    @GetMapping("hello")
    public DistrictDO hello(String adCode) {
        return districtRepository.findFirstOneByAdCode(adCode).get();
    }
}
