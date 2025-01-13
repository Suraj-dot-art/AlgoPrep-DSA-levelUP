package Arrars-4-LevelUp.Max Distance bn person;

public class leet849 {
    int n = seats.length;
    int ans = Integer.MIN_VALUE; // coz max distance nikalna he
    int index = -1 ; // kyuki agar starting ke 1 2 3 4 me nhi mila to max distance 4 tak ho jaaega

    for(
    int i = 0;i<n;i++)
    {
        if (seats[i] == 1) { // if found a person
            if (index == -1) {
                ans = Math.max(ans, i); // agar starting ke kahi par bhi mil gya to distance vaha tak ka ho jaaega
            } else {
                int mid = (i - index) / 2; // agar kisi dono ke bichme bethna he to
                ans = Math.max(ans, mid);
            }

            index = i;
        }
    }ans=Math.max(ans,n-1-index);return ans;
}
