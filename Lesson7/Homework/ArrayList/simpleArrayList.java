package Lesson7.Homework.ArrayList;


public class simpleArrayList {

    Object[] myObject;

    simpleArrayList() {

    }


    public void addFirst(Object obj) {

        Object[] tempArray;

        if (myObject == null) {
            myObject = new Object[1];
            myObject[0] = obj;
            return;
        }

        tempArray = new Object[myObject.length + 1];

        tempArray[0] = obj;

        for (int i = 0, j = 1; i < myObject.length; i++, j++) {
            tempArray[j] = myObject[i];
        }

        myObject = tempArray;
    }


    public void addLast(Object obj) {
        Object[] tempArray;

        if (myObject == null) {
            myObject = new Object[1];
            myObject[0] = obj;
            return;
        }

        tempArray = new Object[myObject.length + 1];
        tempArray[tempArray.length - 1] = obj;
        for (int i = 0; i < myObject.length; i++) {
            tempArray[i] = myObject[i];
        }
        myObject = tempArray;

    }


    public void addAfter(Object prev, Object obj) {

        Object[] tempArray;

        boolean check = false;

        if (myObject == null || myObject.length == 0) {
            throw new IllegalStateException("List has no elements");
        }

        tempArray = new Object[myObject.length + 1];

        for (int i = 0, j = 0; i < myObject.length && j < tempArray.length; i++) {

            if (prev.equals(myObject[i])) {
                check = true;
                tempArray[j] = myObject[i];
                tempArray[j + 1] = obj;
                j += 2;
            } else {
                tempArray[j] = myObject[i];
                j++;
            }

        }

        if (!check) {
            throw new IllegalStateException("List has no such element.");
        }

        myObject = tempArray;
    }


    public Object getByPosition(int pos){


        if(myObject == null || myObject.length == 0){
            throw new IllegalStateException("List is empty.");
        }

        if(pos < 0 || pos>myObject.length){
            throw new IllegalStateException("WRONG position number!!!");
        }

        if(myObject[pos] == null){
            throw new IllegalStateException("Nothing is found!");
        }else {
            return myObject[pos];
        }
    }


    public void remove(Object obj){

        Object[] tempArray;

       int objNumber = 0;

        if(myObject == null || myObject.length == 0){
            throw new IllegalStateException("List is empty.");
        }
        for(int i = 0;i<myObject.length;i++) {
            if (obj.equals(myObject[i])) {
                objNumber+=1;
            }
        }

        tempArray = new Object[myObject.length-objNumber];

        for(int i = 0,j = 0;i<myObject.length && j<tempArray.length ;i++){
            if(obj.equals(myObject[i])){
                continue;
            }
            tempArray[j] = myObject[i];
            j++;
        }

        if(objNumber == 0){
            throw new IllegalStateException("There is no such element in this list.");
        }

        myObject = tempArray;

    }


    public Object[] getMyObject() {
        return myObject;
    }

    public void printArrayList() {
        System.out.print("[ ");
        for (int i = 0; i < myObject.length; i++) {
            if (i == myObject.length - 1) {
                System.out.print(myObject[i]);
            } else {
                System.out.print(myObject[i] + " || ");
            }
        }
        System.out.println("]");

    }

}
