// src/main/java/PacketAnalysisService.java

import java.util.List;

public class PacketAnalysisService {
    public void analyzePackets(List<String> packets) {
        for (String packet : packets) {
            // Implement intrusion detection logic here
            if (packet.contains("suspicious")) {
                System.out.println("Intrusion detected: " + packet);
            } else {
                System.out.println("No intrusion detected for packet: " + packet);
            }
        }
    }
}
