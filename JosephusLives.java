class JosephusLives {
//implementation of the josephus problem with a circular list
//and each person being able to survive multiple stabs
    static class Node {
        int val;
        Node next;
        int lives;

        Node(int v, int lives) {
            val = v;
            this.lives = lives;
        }

        // returns true if we should kill this node
        // returns false if it's got more lives.
        public boolean kill () {
            if (lives > 1) {
                lives--;
                return false;
            } else {
                return true;
            }
        }
    }

    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        // number of lives per person
        int L = Integer.parseInt(args[2]);
        // starting position, base 1
        int SP = Integer.parseInt(args[3]);
        // creation of circular list!
        Node t = new Node(1, L);
        Node x = t;
        for (int i = 2; i <= N; i++) {
            x = (x.next = new Node(i, L));
        }
        x.next = t;
        // set the position equal to the parameter
        while (SP != 1) {
            x = x.next;
            SP--;
        }
        while (x != x.next) {
            // finds element to eliminate!
            for (int i = 1; i < M; i++) {
                x = x.next;
            }
            // eliminate element if it only has 1 life left!
            if (x.kill()) {
                x.next = x.next.next;
            } else {
                x = x.next;
            }
        }
        System.out.println("The elected is " + x.val);
    }
}
