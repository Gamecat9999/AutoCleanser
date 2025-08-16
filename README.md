# 🧹 AutoCleanser

AutoCleanser is a lightweight Minecraft plugin that periodically removes dropped items not on a configurable whitelist. Perfect for keeping your server clean and mythically tidy.

## ✨ Features
- Scheduled cleanup every X minutes
- Whitelist of allowed item types
- Optional broadcast when items are removed
- `/cleanser reload` command

## ⚙️ Configuration
```yaml
interval-minutes: 10
broadcast-removal: true
whitelist:
  - DIAMOND
  - GOLD_INGOT
  - EMERALD
