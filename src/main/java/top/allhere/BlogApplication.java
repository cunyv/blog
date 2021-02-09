package top.allhere;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@MapperScan("top.allhere.mapper")
@Controller
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	private static Logger logger = LoggerFactory.getLogger(BlogApplication.class);
	@RequestMapping("/data")
	@ResponseBody
	public Map<String, Object> getName(){
		logger.info("请求数据");
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> data = new HashMap<>();
		List<Map<String, Object>> list = new ArrayList<>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", 100);
		data.put("id", 1);
		data.put("username", "张键");
		list.add(data);
		map.put("data", list);
		return map;
	}

	@GetMapping("/abc")
//	public String redirect(@PathVariable("url") String url){
	public String redirect(String url){
		logger.info("经过视图解析器！");
		return "index";
	}

}
