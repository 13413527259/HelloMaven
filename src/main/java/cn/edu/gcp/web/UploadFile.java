package cn.edu.gcp.web;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadFile {

	@RequestMapping("goUploadPage")
	public String goUploadPage() {
		return "upload";
	}
	
	@RequestMapping("goResult")
	public String goResult(Model model) {
		return "uploadResult";
	}
	
	@RequestMapping("upload")
	public String upload(@RequestParam(value="file",required=false)MultipartFile file,HttpServletRequest request,Model model) {
		// 判断文件是否为空  
        if (!file.isEmpty()) {  
            try {  
            	System.out.println(file.getName());
                // 文件保存路径  
//                String filePath = request.getSession().getServletContext().getRealPath("/upload/")  
//                       + file.getOriginalFilename();  
            	String filePath = "C:\\eclipse-workspace\\HelloMaven\\src\\main\\webapp\\upload\\"+ file.getOriginalFilename(); 
                // 转存文件  
                file.transferTo(new File(filePath));  
                model.addAttribute("fileName", file.getOriginalFilename());
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
//		return "uploadResult";
        return "redirect:"+"/upload/"+file.getOriginalFilename();
	}
	
	
	
}
