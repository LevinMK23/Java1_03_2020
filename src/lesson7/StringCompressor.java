package lesson7;

public class StringCompressor {

    private String data, compressedData;

    public StringCompressor(String data) {
        this.data = data;
        compressedData = data;
    }

    public String decompress(String compressedString) {
        // a135(f)4(r) если цифр более 1 то число надо собрать
        // 1) d = ""; d = "5" + d; 135 если не цифра, то число собрано
        //
        char[] c = compressedString.toCharArray();
        StringBuilder value = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                value.append(c[i]);
            } else {
                if (c[i] == '(') {
                    //123(sym)
                    int len = Integer.parseInt(value.toString());
                    char sym = c[i + 1];
                    for (int j = 0; j < len; j++) {
                        result.append(sym);
                    }
                    i += 2;
                    value = new StringBuilder();
                } else {
                    result.append(c[i]);
                }
            }
        }
        return result.toString();
    }

    public String compress() {
        // abc -> 1(a)2(b)3(c), abbc -> a2(b)c
        // посчитаем подряд идущие одинаковые буквы
        char[] chars = data.toCharArray();
        int cnt = 1;
        char sym = ' ';
        StringBuilder cD = new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) { // ArrayIndexOut
                sym = chars[i];
                cnt++;
                if (i == chars.length - 2) {
                    cD.append(cnt)
                            .append('(')
                            .append(sym)
                            .append(')');
                }
            } else {
                if (cnt > 1) {
                    // cnt(sym)
                    cD.append(cnt)
                            .append('(')
                            .append(sym)
                            .append(')');
                    cnt = 1;
                } else {
                    // chars[i]
                    cD.append(chars[i]);
                    cnt = 1;
                }
            }
        }
        if (chars.length <= 1) {
            return data;
        } else if (chars[chars.length - 1] != chars[chars.length - 2]) {
            cD.append(chars[chars.length - 1]);
        }
        return cD.toString();
    }

    public boolean isGood() {
        return compressedData.length() < data.length();
    }

    public static void main(String[] args) {
        System.out.println(
                new StringCompressor("aaaaaaacccdfffff")
                        .compress());
        System.out.println(
                new StringCompressor("aabbcc")
                        .compress());
        System.out.println(
                new StringCompressor("abcdeeefffffggrgrgrggr")
                        .compress());
        StringCompressor compressor = new StringCompressor("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(compressor.compress());
        System.out.println(compressor.isGood());
        System.out.println(compressor.decompress("15(e)6(f)x"));
    }

}
