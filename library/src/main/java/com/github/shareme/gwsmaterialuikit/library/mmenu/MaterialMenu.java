/*
 * Copyright (C) 2014 Balys Valentukevicius
 * Modifications Copyright(C) 2016 Fred Grott(GrottWorkShoop)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.shareme.gwsmaterialuikit.library.mmenu;

import android.animation.Animator;
import android.view.animation.Interpolator;



/**
 * API for interaction with {@link MaterialMenuDrawable}
 */
public interface MaterialMenu {
    /**
     * Change icon without animation
     *
     * @param state new icon state
     */
    void setState(MaterialMenuDrawable.IconState state);

    /**
     * Return current icon state
     *
     * @return icon state
     */
    MaterialMenuDrawable.IconState getState();

    /**
     * Animate icon to given state.
     *
     * @param state new icon state
     */
    void animateState(MaterialMenuDrawable.IconState state);

    /**
     * Animate icon to given state and draw touch circle
     *
     * @param state new icon state
     * @deprecated Pressed state is not supported. Use {#animateState(IconState)}
     */
    @Deprecated
    void animatePressedState(MaterialMenuDrawable.IconState state);

    /**
     * Set color of icon
     *
     * @param color new icon color
     */
    void setColor(int color);

    /**
     * Set visibility of icon
     *
     * @param visible new value for visibility
     */
    void setVisible(boolean visible);

    /**
     * Set duration of transformation animations
     *
     * @param duration new animation duration
     */
    void setTransformationDuration(int duration);

    /**
     * Set interpolator for transformation animations
     *
     * @param interpolator new interpolator
     */
    void setInterpolator(Interpolator interpolator);

    /**
     * Set listener for {@code MaterialMenuDrawable} animation events
     *
     * @param listener new listener or null to remove any listener
     */
    void setAnimationListener(Animator.AnimatorListener listener);

    /**
     * Enable RTL layout. Flips all icons horizontally
     *
     * @param rtlEnabled true to enable RTL layout
     */
    void setRTLEnabled(boolean rtlEnabled);

    /**
     * Manually set a transformation value for an {@link MaterialMenuDrawable.AnimationState}
     *
     * @param animationState state to set value in
     * @param value          between {@link MaterialMenuDrawable#TRANSFORMATION_START} and
     *                       {@link MaterialMenuDrawable#TRANSFORMATION_END}.
     */
    void setTransformationOffset(MaterialMenuDrawable.AnimationState animationState, float value);

    /**
     * @return {@link MaterialMenuDrawable} to be used for the menu
     */
    MaterialMenuDrawable getDrawable();
}
