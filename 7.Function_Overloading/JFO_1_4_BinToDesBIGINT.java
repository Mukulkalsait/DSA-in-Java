import java.math.BigInteger;
import java.util.*;

// WARN: This function is not giving expected resualts
// __
// __
// public class JFO_1_4_BinToDesBIGINT {
// //
// public static BigInteger binToDec(BigInteger binNum) {
// int root = 0;
// BigInteger num = BigInteger.valueOf(0);
// do {
// BigInteger lastDig = binNum.divide(BigInteger.valueOf(10));
// num = num.add(lastDig.multiply(BigInteger.valueOf((long) Math.pow(2,
// root))));
// //
// root++;
// binNum = binNum.divide(BigInteger.valueOf(10));
// } while (binNum.compareTo(BigInteger.valueOf(0)) > 0);
// return num;
// } //
// //
// public static void main(String[] args) {
// //
// Scanner sc = new Scanner(System.in);
// System.out.println("please input the binary number in the form of 1's and
// 0's:");
// BigInteger binNum = new BigInteger(sc.nextLine());
// BigInteger orignal = binNum;
// BigInteger res = binToDec(binNum);
// System.out.println("The decimal conversion of " + orignal + "is :" + res);
// sc.close();
// }
// }
//
//
//
// --TODO:
// --======================================================================================================
// --HACK:
// --======================================================================================================
// --WARN:
// --======================================================================================================
// --NOTE:
// --======================================================================================================
// --TEST:
// --======================================================================================================
// --PERF:
// --======================================================================================================
// --HEAD:
// --======================================================================================================
// --TAG:
// --======================================================================================================
// --CARD:
// --======================================================================================================
// --DIV:
// --======================================================================================================
// --
// --R:
// --======================================================================================================
// --R2:
// --======================================================================================================
// --B:
// --======================================================================================================
// --B2:
// --======================================================================================================
// --G:
// --======================================================================================================
// --G2:
// --======================================================================================================
// --Y:
// --======================================================================================================
// --Y2:
// --======================================================================================================
// --DX:
// --======================================================================================================
