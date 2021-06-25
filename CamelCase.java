public class CamelCase {
    static String toCamelCase(String s){
        String[] str = s.split("[-_]");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length; i++){
            if(i != 0){
                String changed = str[i].substring(0,1).toUpperCase() + str[i].substring(1);
                sb.append(changed);
            }else sb.append(str[i]);
        }
        return sb + "";
    }
}
