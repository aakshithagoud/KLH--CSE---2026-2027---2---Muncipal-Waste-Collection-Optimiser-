static String getPriority(int wasteLevel) {
if (wasteLevel >= 80) {// CO3
return "HIGH";
} else if (wasteLevel >= 50) {
return "MEDIUM";
} else {// CO3
return "LOW";
}
}
