# my lab3

public static int[] duplist(int[] a){
	size=a.lenght;
    int count=0;
    int current=1;
    int numofdups=0;
    int[] duplist;
    while (count<size-1){
        while (current<size){
            if(a[count]==a[current]){
                duplist[numofdups]=a[count];
                numofdups++;
                break;
            }
            current++;
        }
        count++;
        current=count-1;
    }
    return duplist;

}
