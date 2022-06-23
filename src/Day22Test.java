public class Day22Test {
    public static void main(String[] args) {
        Day22 d22 = new Day22();
        int[] output = d22.bubbleSort(new int[]{5,3,8,1,2,7});
        for(int i=0; i<output.length;i++){
            System.out.println(output[i]); // --> [1, 2, 3]
        }

    }
}

class Day22 {
    public int[] bubbleSort(int[] arr) {
        // TODO:
        int temp=0;//버블소트시 생기는 위치 변경용 임시저장 변수
        int checkChange=0;//버블소트시 모든 위치에서 변경이 일어나지 않았을때를 체크하기위한 변수

        for(int i=0; i<arr.length;i++){  // 버블소트는 최대 n번 실행되기 때문
            for(int j=0; j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    checkChange++; //위치의 변경이 일어날때마다 ++
                }
            }
            if(checkChange==0){   //위치의 변경이 일어나지않았을때 바로 리턴
                return arr;
            }
            checkChange=0;      //1회 수행시마다 0으로 초기화해준다
        }
        return arr;
    }
}
