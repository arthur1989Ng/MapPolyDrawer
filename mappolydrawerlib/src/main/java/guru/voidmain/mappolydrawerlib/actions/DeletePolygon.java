package guru.voidmain.mappolydrawerlib.actions;

import com.brianegan.bansa.Action;

/**
 * Created by voidmain on 16/6/12.
 */
public class DeletePolygon implements Action {
    public int polygonIndex;

    public DeletePolygon(int polygonIndex) {
        this.polygonIndex = polygonIndex;
    }
}
