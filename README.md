# 🏠 Home Automation System (Console-Based Java Project)

## 📘 Overview
This is a **console-based Java application** that simulates a **Home Automation System**, allowing users to manage rooms and devices within a house.  
It demonstrates key **Object-Oriented Programming (OOP)** concepts like **classes**, **inheritance**, and **encapsulation**, while keeping all data stored **in-memory** (no database required).

---

## ⚙️ Features
- 🏡 Add multiple rooms (e.g., Kitchen, Bedroom, Living Room)
- 💡 Add different devices to each room
  - Lights
  - Air Conditioners
  - Televisions
  - Electronic Devices
- 🔄 Toggle any device ON or OFF remotely
- 👁️ View current status of all rooms and devices
- ⏱️ Track how long each device has been in the ON state
- 🚀 Designed for easy extension — you can add new devices or room types easily

---

## 🧩 Project Structure
```
HomeAutomationProject/
 └── src/
     └── homeautomation/
         ├── Device.java
         ├── DeviceState.java
         ├── Light.java
         ├── AirConditioner.java
         ├── Television.java
         ├── Room.java
         ├── Home.java
         └── HomeAutomationApp.java
```

---

## 🖥️ How to Run (Eclipse)
1. Open **Eclipse IDE**
2. Go to **File → Import → Existing Projects into Workspace**
3. Select the extracted `HomeAutomationProject` folder
4. Open `HomeAutomationApp.java`
5. Right-click → **Run As → Java Application**

---

## 🧠 Example Console Output
```
=== Home Automation Console ===
1. Add Room
2. Add Device to Room
3. Toggle Device
4. Show Status
5. Exit
Choose: 1
Enter room name: Living Room
Room added.

Choose: 2
Enter room name: Living Room
Device types: Light, AirConditioner, Television
Enter device type: Light
Enter device name: Main Light
Device added.

Choose: 3
Enter room name: Living Room
Enter device name: Main Light
Toggled Main Light -> ON
```

---

## 🧰 Technologies Used
- Java 17 (or above)
- Eclipse IDE
- Standard Java Libraries (`java.util`, `java.time`)

---

## 📂 Future Enhancements
- Connect with a real **SQL database** (MySQL or SQLite)
- Add a **Swing GUI** or **HTML/JS web frontend**
- Track device ON/OFF durations more precisely
- Export reports of device usage

---

## 👨‍💻 Author
**Vasi Khan**  
💬 Java Developer | System Engineering Enthusiast  
🔗 [GitHub Profile](https://github.com/)
