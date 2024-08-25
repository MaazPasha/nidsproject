# Network Intrusion Detection System (NIDS)

This project is a basic Network Intrusion Detection System (NIDS) built in Java. 
It captures and analyzes network traffic to detect potential intrusions, displaying results on a web interface.

## Project Structure
nids-project/ ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ ├── NidsApplication.java │ │ │ ├── PacketCaptureService.java │ │ │ ├── PacketAnalysisService.java │ │ │ └── WebController.java │ │ └── resources/ │ │ ├── application.properties │ │ └── templates/ │ │ ├── index.html │ │ └── intrusions.html ├── .gitignore ├── pom.xml └── README.md



## Requirements

- **Java 11+**
- **Maven**
- **Wireshark/TShark**

## How to Run

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/nids-project.git
    cd nids-project
    ```

2. **Build the project**:
    ```sh
    mvn clean install
    ```

3. **Start the application**:
    ```sh
    mvn spring-boot:run
    ```

4. **Access the application**:
    - Go to http://localhost:8080 for the homepage.
    - Go to http://localhost:8080/intrusions to view detected intrusions.

## Notes

- Make sure TShark is installed and working properly.
- The application properties can be configured in `src/main/resources/application.properties`.
