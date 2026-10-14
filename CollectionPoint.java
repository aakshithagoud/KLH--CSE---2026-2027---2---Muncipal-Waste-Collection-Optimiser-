class CollectionPoint {
public static void main(String[] args);
String id, location, wasteType;
int wasteLevel; // percentage: 0 to 100
CollectionPoint(String id, String location,
String wasteType, int wasteLevel) {//CO1
if (wasteLevel < 0 || wasteLevel > 100) {//CO1
throw new IllegalArgumentException(
"Waste level must be 0 to 100");
}//CO1
this.id = id;
this.location = location;
this.wasteType = wasteType;
this.wasteLevel = wasteLevel;
}
boolean needsCollection() {
return wasteLevel >= 80;
}
}