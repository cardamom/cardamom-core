package cardamom.core.api.managers;

import cardamom.core.api.Context;
import cardamom.core.api.Decision;
import cardamom.core.api.Resource;

/**
 * A manager to perform authorization checks
 * or enforcements
 */
public interface EnforcementManager {
    /**
     * Given a {@link cardamom.core.api.Context},
     * enforce access checks on the {@link cardamom.core.api.Resource}
     * @param context
     * @return
     */
    Decision enforce(Context context, Resource resource);
}
