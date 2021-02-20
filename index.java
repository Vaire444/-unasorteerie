import java.util.*;

class Apples {

  public static void main(String[] args) {
    ArrayList<Integer> sm = new ArrayList<Integer>();
    ArrayList<Integer> med = new ArrayList<Integer>();
    ArrayList<Integer> bg = new ArrayList<Integer>();
    int[] apples = {
      29,
      70,
      85,
      77,
      55,
      44,
      33,
      98,
      90,
      47,
      22,
      44,
      55,
      37,
      65,
    };

    for (int i = 0; i < apples.length; i++) {
      if (apples[i] <= 50) {
        sm.add(apples[i]);
      } else if (apples[i] > 70) {
        bg.add(apples[i]);
      } else {
        med.add(apples[i]);
      }
    }
    System.out.println("Väikesed õunad(kuni 50g): " + sm);
    System.out.println("Keskmised õunad (vahemikus 51-70g): " + med);
    System.out.println("Suured õunad(üle 70g): " + bg);
  }
}
