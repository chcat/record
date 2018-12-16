package io.github.chcat.record;

public abstract class Record<F extends FieldModel, R extends RecordModel<F>> {
    private final R model;

    protected Record(R model){
        this.model = model;
    }

    public R getModel(){
        return model;
    }

    protected abstract Object getFieldValue(F field);

    protected abstract void setFieldValue(F field, Object value);

}
