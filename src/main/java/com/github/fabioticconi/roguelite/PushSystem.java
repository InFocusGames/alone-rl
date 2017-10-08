/*
 * Copyright (C) 2017 Fabio Ticconi
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.github.fabioticconi.roguelite;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.systems.DelayedIteratingSystem;
import com.github.fabioticconi.roguelite.components.Pushable;

/**
 * Author: Fabio Ticconi
 * Date: 07/10/17
 */
public class PushSystem extends DelayedIteratingSystem
{
    ComponentMapper<Pushable> mPushable;

    public PushSystem()
    {
        super(Aspect.all(Pushable.class));
    }

    @Override
    protected float getRemainingDelay(final int entityId)
    {
        return 0;
    }

    @Override
    protected void processDelta(final int entityId, final float accumulatedDelta)
    {

    }

    @Override
    protected void processExpired(final int entityId)
    {

    }

    public float push(final int entityId, final int toPushId)
    {
        return 0f;
    }
}