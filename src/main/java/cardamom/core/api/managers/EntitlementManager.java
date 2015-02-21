package cardamom.core.api.managers;

import cardamom.core.api.Context;
import cardamom.core.api.Entitlement;

import java.util.Set;

/**
 * Entitlement Manager to deal with
 * a set of {@link cardamom.core.api.Entitlement}
 * under a particular {@link cardamom.core.api.Context}
 */
public interface EntitlementManager {
    /**
     * Given a {@link cardamom.core.api.Context},
     * retrieve a set of {@link cardamom.core.api.Entitlement}
     * @param context
     * @return
     */
    Set<Entitlement> retrieve(Context context);
}
