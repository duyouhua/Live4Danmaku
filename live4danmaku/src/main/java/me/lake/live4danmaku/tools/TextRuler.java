package me.lake.live4danmaku.tools;

import android.graphics.Paint;
import android.text.TextPaint;

import me.lake.live4danmaku.model.others.SizeF;

/**
 * Created by Lakeinchina(lakeinchina@hotmail.com) on 2015/10/23.
 * Live4Danmaku Project
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
public class TextRuler {
    public static SizeF calcTextWH(String text, TextPaint paint) {
        Paint.FontMetrics fm = paint.getFontMetrics();
        return new SizeF(paint.measureText(text), fm.descent - fm.ascent);
    }
}
