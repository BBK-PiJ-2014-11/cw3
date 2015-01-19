/**
 * Created by Ehshan
 */
public class SampleableListImpl implements SampleableList {
    private List sampleList;

    public SampleableListImpl(List list) {
        sampleList = list;
    }


    public SampleableList sample(){
        SampleableList newList = new SampleableListImpl(sampleList) ;
        if (!isEmpty()){
            for (int i = 0; i < sampleList.size(); i++) {
                if (i % 2 != 0) {
                    newList.add(sampleList.get(i).getReturnValue());
                }
            }
        }
        return newList;
    }



}
