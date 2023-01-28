/*
 * Unitto is a unit converter for Android
 * Copyright (c) 2023 Elshan Agaev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.sadellie.unitto.data.units.collections

import com.sadellie.unitto.data.R
import com.sadellie.unitto.data.units.AbstractUnit
import com.sadellie.unitto.data.units.MyUnit
import com.sadellie.unitto.data.units.MyUnitIDS
import com.sadellie.unitto.data.units.UnitGroup
import java.math.BigDecimal

internal val timeCollection: List<AbstractUnit> by lazy {
    listOf(
        MyUnit(MyUnitIDS.attosecond,    BigDecimal.valueOf(1),                                  UnitGroup.TIME, R.string.attosecond,    R.string.attosecond_short),
        MyUnit(MyUnitIDS.nanosecond,    BigDecimal.valueOf(1_000_000_000),                      UnitGroup.TIME, R.string.nanosecond,    R.string.nanosecond_short),
        MyUnit(MyUnitIDS.microsecond,   BigDecimal.valueOf(1_000_000_000_000),                  UnitGroup.TIME, R.string.microsecond,   R.string.microsecond_short),
        MyUnit(MyUnitIDS.millisecond,   BigDecimal.valueOf(1_000_000_000_000_000),              UnitGroup.TIME, R.string.millisecond,   R.string.millisecond_short),
        MyUnit(MyUnitIDS.jiffy,         BigDecimal.valueOf(10_000_000_000_000_000),             UnitGroup.TIME, R.string.jiffy,         R.string.jiffy_short),
        MyUnit(MyUnitIDS.second,        BigDecimal.valueOf(1_000_000_000_000_000_000),          UnitGroup.TIME, R.string.second,        R.string.second_short),
        MyUnit(MyUnitIDS.minute,        BigDecimal.valueOf(60_000_000_000_000_000_000.0),       UnitGroup.TIME, R.string.minute,        R.string.minute_short),
        MyUnit(MyUnitIDS.hour,          BigDecimal.valueOf(3_600_000_000_000_000_000_000.0),    UnitGroup.TIME, R.string.hour,          R.string.hour_short),
        MyUnit(MyUnitIDS.day,           BigDecimal.valueOf(86_400_000_000_000_000_000_000.0),   UnitGroup.TIME, R.string.day,           R.string.day_short),
        MyUnit(MyUnitIDS.week,          BigDecimal.valueOf(604_800_000_000_000_000_000_000.0),  UnitGroup.TIME, R.string.week,          R.string.week_short),
    )
}