public class Credit {
    private int credit;
    this.credit = c;

    public void setCredit(int c) {
        credit = c;
    }

    public int getCredit() {
        return credit;
    }

    public boolean hasCredit() {
        if (credit > 0) {
            return true;
        } else {
            return false;
        }
    }

}
