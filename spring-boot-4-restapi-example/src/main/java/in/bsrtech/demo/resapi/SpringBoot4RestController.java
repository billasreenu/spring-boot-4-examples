package in.bsrtech.demo.resapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bsrtech.demo.vo.AppResponseVO;

@RestController
public class SpringBoot4RestController {

	@GetMapping(path = "test")
	public AppResponseVO getTestResponseA() {
		AppResponseVO vo = new AppResponseVO();
		IO.print("SpringBoot4RestController test api called");

		vo.setStatus(200l);
		vo.setMessage("SUCCESS");

		return vo;
	}

	@GetMapping(path = { "test11", "test12", "test13" })
	public AppResponseVO getTestResponseB() {
		AppResponseVO vo = new AppResponseVO();
		IO.print("SpringBoot4RestController test*** api called");

		vo.setStatus(200l);
		vo.setMessage("SUCCESS");

		return vo;
	}

}
