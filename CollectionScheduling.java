class CollectionScheduling {
 static String getPriority(int wasteLevel) {
  if (wasteLevel >= 80) {
     return "HIGH";
     } else if (wasteLevel >= 50) {
         return "MEDIUM";
     } else {
         return "LOW";
        }
      }
public static void main(String[] args) {
  System.out.println(getPriority(90));
  System.out.println(getPriority(60));
  System.out.println(getPriority(30));
    }
  }