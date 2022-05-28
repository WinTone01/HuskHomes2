package net.william278.huskhomes.list;

import de.themoep.minedown.MineDown;
import net.william278.huskhomes.position.SavedPosition;
import net.william278.huskhomes.position.Warp;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class WarpList extends PositionList {

    public WarpList(@NotNull List<Warp> warps, int itemsPerPage) {
        super(warps.stream().map(position -> (SavedPosition) position).collect(Collectors.toList()), itemsPerPage);
    }

    @Override
    protected String getItemSeparator() {
        return null;
    }

    @Override
    protected MineDown getHeader(int pageItemStart, int pageItemEnd, int totalItemCount) {
        return null;
    }

    @Override
    protected MineDown getFooter(@NotNull FooterLayout layout, int pageNumber, int maxPages) {
        return null;
    }

    @Override
    protected String getFormattedItem(SavedPosition position) {
        return null;
    }

    @Override
    protected MineDown getNoItemsMessage() {
        return null;
    }

    @Override
    protected MineDown getInvalidPageNumberMessage() {
        return null;
    }
}