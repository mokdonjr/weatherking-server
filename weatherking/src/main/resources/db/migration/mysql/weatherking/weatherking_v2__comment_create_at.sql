ALTER TABLE `comment`
ADD COLUMN `is_updated` TINYINT(1) NOT NULL DEFAULT 0 AFTER `create_at`,
ADD COLUMN `update_at` DATETIME NULL AFTER `is_updated`,
ADD COLUMN `is_deleted` TINYINT(1) NOT NULL DEFAULT 0 AFTER `update_at`,
ADD COLUMN `delete_at` DATETIME NULL AFTER `is_deleted`;
