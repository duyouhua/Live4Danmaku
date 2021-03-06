package me.lake.live4danmaku.model.cache;


import android.graphics.Bitmap;

import me.lake.live4danmaku.model.others.Position;
import me.lake.live4danmaku.model.others.Size;

/**
 * Created by Lakeinchina(lakeinchina@hotmail.com) on 2015/10/20.
 * Live4Danmaku Project
 *
 * Copyright (C) 2015 Po Hu <lakeinchina@hotmail.com>
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
public interface ICacheManager {

    public Cache requireCache(Size size);

    public void releaseCache(Cache cache);

    public BitmapClip getBitmapClipByCacheId(int id);

    public class BitmapClip {
        public Position pos;
        public Size size;
        public Bitmap bitmap;
    }
}
