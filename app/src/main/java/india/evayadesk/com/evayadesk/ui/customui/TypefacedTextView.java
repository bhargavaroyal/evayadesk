package india.evayadesk.com.evayadesk.ui.customui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import india.evayadesk.com.evayadesk.R;


/**
 * Created by bhargavagugamsetty on 17/05/16.
 */
public class TypefacedTextView extends TextView {

    public TypefacedTextView(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        if (attrs != null) {

            final TypedArray styledAttrs = context.obtainStyledAttributes(attrs, R.styleable.TypefacedTextView);
            final int typefaceCode = styledAttrs.getInt(R.styleable.TypefacedTextView_font, -1);
            styledAttrs.recycle();
            setTextType(context, typefaceCode);
        }
    }

    private void setTextType(Context context, int typefaceCode) {
        if (isInEditMode()) {
            return;
        }
        if (typefaceCode == -1) {
            setTypeface(Typeface.DEFAULT);
        } else {
            final Typeface typeface = TypefaceCache.get(context.getAssets(), Typefaces.getTypeface(typefaceCode));
            setTypeface(typeface);
        }
    }

    public TypefacedTextView(final Context context) {
        super(context);
        setTextType(context, 1);
    }

    public final void setTypeface(final String fontName) {

        if (fontName != null) {
            final Typeface typeface = TypefaceCache.get(getContext().getAssets(), fontName);
            setTypeface(typeface);
        }

    }
}


