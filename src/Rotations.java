//Input:
// - a string strng
// - an array of strings arr
//Output of function contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):
// - a boolean true if all rotations of strng are included in arr (C returns 1)
// - false otherwise (C returns 0)
//#Examples:
//contain_all_rots(
//"bsjq", ["bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs"]) -> true
//
//contain_all_rots(
//"Ajylvpy", ["Ajylvpy", "ylvpyAj", "jylvpyA", "lvpyAjy", "pyAjylv", "vpyAjyl", "ipywee"]) -> false)

import java.util.ArrayList;
import java.util.List;

public class Rotations {

    public static Boolean containAllRots(String strng, List<String> arr) {
        for(int i = 0; i<strng.length(); i++) {
            if(arr.contains(strng)) {
                strng = strng.substring(1) + strng.substring(0, 1);
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("bsjq");
        list.add("qbsj");
        list.add("sjqb");
        list.add("twZNsslC");
        list.add("jqbs");
        System.out.println(containAllRots("bsjq", list));
    }

    //Alternate answer
//    public class Rotations {
//
//        public static Boolean containAllRots(String strng, List<String> arr) {
//            for(int i=0;i<strng.length();i++)
//                if(!arr.contains(strng.substring(i,strng.length())+strng.substring(0,i)))
//                    return false;
//            return true;
//        }
//    }
}
