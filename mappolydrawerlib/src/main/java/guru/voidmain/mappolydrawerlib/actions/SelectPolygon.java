package guru.voidmain.mappolydrawerlib.actions;

import com.brianegan.bansa.Action;

/**
 * Created by voidmain on 16/6/12.
 */
public class SelectPolygon implements Action {
    public int polygonIndex;

    public SelectPolygon(int polygonIndex) {
        this.polygonIndex = polygonIndex;
    }
}
