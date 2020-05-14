package org.itstep.msk.app.service;

import org.itstep.msk.app.entity.AudioRecord;
import org.itstep.msk.app.entity.Post;
import org.itstep.msk.app.entity.User;
import org.itstep.msk.app.exceptions.UnsupportedMediaTypeException;

public interface AudioService {
    void add(User user, AudioRecord audioRecord) throws UnsupportedMediaTypeException;

    void addRecordToPost(Post post, AudioRecord audioRecord);

    void deleteRecordFromPost(Post post, AudioRecord audioRecord);
}
