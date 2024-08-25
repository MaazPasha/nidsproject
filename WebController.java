// src/main/java/WebController.java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {

    private final PacketCaptureService packetCaptureService;
    private final PacketAnalysisService packetAnalysisService;

    public WebController(PacketCaptureService packetCaptureService, PacketAnalysisService packetAnalysisService) {
        this.packetCaptureService = packetCaptureService;
        this.packetAnalysisService = packetAnalysisService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/intrusions")
    public String detectIntrusions(Model model) {
        List<String> packets = packetCaptureService.capturePackets("localhost", 8080);
        packetAnalysisService.analyzePackets(packets);
        model.addAttribute("packets", packets);
        return "intrusions";
    }
}
