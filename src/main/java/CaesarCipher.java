public class CaesarCipher {
    private String mText;
    private int mShift;

    public CaesarCipher(String mText, int mShift) {
        this.mText = mText;
        this.mShift = mShift;
    }
    public String getText() {
        return mText;
    }

    public int getShift() {
        return mShift;
    }

    public static char cipher(char c, int k) {

        final int alphaLength = 26;
        final char asciiShift = Character.isUpperCase(c) ? 'A' : 'a';
        final int cipherShift = k % alphaLength;

        char shifted = (char) (c - asciiShift);
        shifted = (char) ((shifted + cipherShift + alphaLength) % alphaLength);

        return (char) (shifted + asciiShift);
    }

    public  String cipher() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mText.length(); i++) {
            if(mText.charAt(i) == ' ')
            {
                sb.append(" ");
            }
            else
            {
                sb.append(cipher(mText.charAt(i), mShift));
            }

        }
        return sb.toString();
    }
    }

