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

    @Override
    public boolean isEmpty() {
        return sampleList.isEmpty();
    }

    @Override
    public int size() {
        return sampleList.size();
    }

    @Override
    public ReturnObject get(int index) {
        return sampleList.get(index);
    }

    @Override
    public ReturnObject remove(int index) {
        return sampleList.remove(index);
    }

    @Override
    public ReturnObject add(int index, Object item) {
        return sampleList.add(index, item);
    }

    @Override
    public ReturnObject add(Object item) {
        return sampleList.add(item);
    }

}
