public class SquareDigit {
    public int squareDigits(int n) {
        String numS = n + "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numS.length(); i++){
            int sq = (int) Math.pow(Integer.parseInt(numS.charAt(i) + ""), 2);
            sb.append(sq);
        }
        return Integer.parseInt(sb.toString());
    }
}
