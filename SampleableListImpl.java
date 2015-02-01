/**
 *{@inheritDoc}
 *
 *@author Ehshan Veerabangsa
 */
public class SampleableListImpl extends LinkedList implements SampleableList {

    /**
     *{@inheritDoc}
     */
    @Override
    public SampleableList sample(){
        SampleableList newList = new SampleableListImpl() ;
        if (!isEmpty()) {
            for (int i = 0; i < size(); i++) {
                if (i % 2 == 0) {
                    newList.add(get(i).getReturnValue());
                }
            }
        }
        return newList;
    }

    //not needed
    /*
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
    */
}
