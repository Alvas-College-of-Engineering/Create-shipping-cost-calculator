# 📦 Java Shipping Cost Calculator

**Student:** Swasthik Madivala  
**ID:** 4AL23CS170  

---

## 📋 Project Description

A Java-based Shipping Cost Calculator that:
- Calculates shipping charges based on **package weight**, **distance**, and **delivery option**
- Stores shipment details using proper **classes, constructors, and methods**
- Displays **total shipping cost** with a full shipment summary

---

## 🗂️ Project Structure

```
ShippingCostCalculator/
└── src/
    ├── Main.java              → Entry point, menu-driven interface
    ├── Shipment.java          → Shipment data class (fields + constructor + display)
    ├── ShippingCalculator.java→ Cost calculation logic
    └── ShipmentStore.java     → Stores and manages all shipments
```

---

## 🚀 How to Run

### Using VS Code Terminal:
```bash
cd src
javac *.java
java Main
```

---

## 💡 Delivery Options & Pricing

| Option    | Rate Multiplier | Handling Charge |
|-----------|----------------|-----------------|
| Standard  | 1.0×           | Rs. 20          |
| Express   | 1.5×           | Rs. 50          |
| Overnight | 2.5×           | Rs. 100         |

**Formula:**  
`Cost = (Weight × Distance × 0.05 × Multiplier) + Handling Charge`

---

## 📸 Sample Output

```
============================================
    JAVA SHIPPING COST CALCULATOR
    Student: SWASTHIK MADIVALA
    ID     : 4AL23CS170
============================================
  Shipment ID     : SH001
  Sender          : Swasthik
  Receiver        : Rahul
  Weight          : 5.00 kg
  Distance        : 200.00 km
  Delivery Option : EXPRESS
  Total Cost      : Rs. 125.00
============================================
```

---

## 🛠️ Technologies Used
- **Java** (Core)
- **VS Code** IDE
- OOP Concepts: Classes, Constructors, Methods, ArrayList
