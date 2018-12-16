package io.github.chcat.record.arraybased;

public class Record extends io.github.chcat.record.Record<FieldModel, RecordModel> {

    private final Field[] fields;

    protected Record(RecordModel model) {
        super(model);
        fields = new Field[model.getFieldCount()];
    }

    @Override
    protected Object getFieldValue(FieldModel field) {
        return fields[field.getId()];
    }

    @Override
    protected void setFieldValue(FieldModel field, Object value) {
        fields[field.getId()].setValue(value);
    }
}
