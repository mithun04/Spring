package in.orangecounty.mithun.spittr.data;

import in.orangecounty.mithun.spittr.Spittle;

import java.util.List;

/**
 * Created by mithun on 7/3/17.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
